public class zXyZ_314159{

public static void main(String[] args){
int [] lolz = {5,3,8,1,2};
sortmeh(lolz);

for(int p = 0;p < lolz.length; p++)
System.out.print(lolz[p] + " ");
}

public static void sortmeh(int[] whaaat){
for(int i=0;i<whaaat.length-1;i++)
{
for(int j=0;j<whaaat.length;j++){
if(whaaat[j] > whaaat[i]{
int temp = whaaat[i];
whaaat[i] = whaaat[j];
whaaat[i] = temp;  // BUG: should be whaaat[j] = temp
}
} } }
