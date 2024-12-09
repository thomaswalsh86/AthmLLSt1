package Merge;
public class Merge_Sort 
{
private long[]arr;
public void merge(long[]workspace,int first,int second,int up)
{

    int workspaceIx=0;
    int lb=first;
    int mid= second-1;
    int unSort=up-lb+1;

    while(first<=mid&&second<=up)
    {
        if(arr[first]<arr[second])
        {
            workspace[workspaceIx++]=arr[first++];
        }
        else
        {
            workspace[workspaceIx++]=arr[second++];
        }
    }
    while (first<=mid) {
        workspace[workspaceIx++]=arr[first++];
        
    }
    while (second<=up) {
        workspace[workspaceIx++]=arr[second++];
        
    }
    for(int i=0;i<unSort;i++)
    {
        arr[lb+i]=workspace[i];
    }

}
public void mergeSort(long[]arr,long[]workspace,int lb,int up)
{
    this.arr = arr;

    if(lb<up)
    {
        int mid =(lb+up)/2;
        mergeSort(arr, workspace, lb, mid);
        mergeSort(arr, workspace, mid+1, up);

        merge(workspace, lb, mid+1, up);
    }
}

   
} 
    
