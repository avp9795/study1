#include<stdio.h>
int limit,arr[10],b[10];

void mergesort(int min,int mid, int max){
int i = min, j = mid+1, k=min; 
while(i<=mid && j<=max){
if(arr[i] <= arr[j]){
b[k] = arr[i];
i++;
k++;
}
else{
b[k] = arr[j];
j++;
k++;
}
}
if(i>mid){
while(j<=max){
b[k] = arr[j];
k++;
j++;
}
}
else{
while(i<=mid){
b[k] = arr[i];
i++;
k++;
}
}
for(int i=min; i<mid; i++){
printf("%d",b[i]);
}
}
void merge(int min, int max){
int mid = min+max/2;
merge(min,mid);
merge(mid+1,max);
mergesort(min,mid,max);
}

void main(){

printf("Enter the limit of arrray");
scanf("%d",&limit);
printf("Enter the array elements");
for(int i =0; i<limit; i++){
scanf("%d",&arr[i]);
}
merge(0,limit-1);
}
