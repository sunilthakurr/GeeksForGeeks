class Solution
{
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        // Code here
        int m=grid.length;

        int n=grid[0].length;

        int[][] arr={{-1,0},{1,0},{0,1},{0,-1}};

        Queue<int[]>Q=new LinkedList<>();

        for(int i=0;i<m;i++)

        {

            for(int j=0;j<n;j++)

            {

                if(grid[i][j]==1)

                {

                    grid[i][j]=0;

                    Q.add(new int[]{i,j});

                }

                else

                grid[i][j]=-1;

            }

        }

        while(!Q.isEmpty())

        {

            int temp=Q.size();

            while(temp-->0)

            {

                int[] a=Q.poll();

                for(int[] dir:arr)

                {

                    int count=a[0]+dir[0];

                    int flag=a[1]+dir[1];

                    if(count>=0 && flag>=0 && count<m && flag<n && grid[count][flag]==-1)

                    {

                        grid[count][flag]=1+grid[a[0]][a[1]];

                            Q.add(new int[]{count,flag});

                    }

                }

            }

        }

        return grid;
    }
}
