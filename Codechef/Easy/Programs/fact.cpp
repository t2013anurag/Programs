#include <stdio.h>

    int main()
    {
        int t;
        scanf("%d", &t);
        int k1;
        for(k1 = 1; k1 <= t; k1++) {
            int  N;
            scanf("%d", &N);
            int result[1000];
            result[0] = 1;
            int length = 1, i, j, x, temp = 0;
            for(i = 2; i <= N; i++) {
                for(j = 0; j < length; j++) {
                    x = temp + result[j] * i;
                    temp = x / 10;
                    result[j] = x % 10;
                }
                while(temp) {
                    result[j] = temp % 10;
                    temp /= 10;
                    j++;
                }
                length = j;
            }
            for(i = length - 1; i >= 0; i--){
                printf("%d", result[i]);
            }
            printf("\n");
        }
        return 0;
    }
