package SSS;

import java.util.Scanner;

public class Main{


public static void main(String[] args) {

Scanner input=new Scanner (System.in);
while(input.hasNext())
{
int N=input.nextInt();

if (N <= 0)

{

return;

}

int[][] NXN = new int[N][N];

for (int i = 0; i < N; i++)

{

for (int j = 0; j < N; j++)

{

if (i == 0)

{

NXN[0][j] = j + 1; //?

}

else if (j == 0)

{

NXN[i][0] = i + 1;//?

}

else

{

int temp = NXN[i][j - 1];//?

if (temp == N)

{

NXN[i][j] = 1;//?

}

else

{

NXN[i][j] = temp + 1;//?

}

}

}

}

for (int i = 0; i < N; i++)

{

for (int j = 0; j < N; j++)

{

System.out.printf("%6d",NXN[i][j]);

}

System.out.println();

}

}
}

}

