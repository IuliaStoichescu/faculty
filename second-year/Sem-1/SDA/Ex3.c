#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char v[100];

int check(int k, int n)
{
    for(int i = 0; i <= k - 1; i++)
    {
        for(int j = i + 1; j <= k; j++)
        {
            if(v[i] == v[j])
            {
                return 0;
            }
        }
    }
    return (k <= n - 1);
}

int sol(int k, int n)
{
    return (k == n - 1);
}

void print(int n)
{
    for(int i = 0; i < n; i++)
    {
        printf("%c", v[i]);
    }
    printf("\n");
}

void backtrack(int k, char *cuv)
{
    char aux;

    //sorting cuv to ensure alphabetical order
    for(int i = 0; i < strlen(cuv) - 1; i++)
    {
        for(int j = i + 1; j < strlen(cuv); j++)
        {
            if(cuv[i] > cuv[j])
            {
                aux = cuv[i];
                cuv[i] = cuv[j];
                cuv[j] = aux;
            }
        }
    }

    for(int i = 0; i < strlen(cuv); i++)
    {
        v[k] = cuv[i];
        if(check(k, strlen(cuv)))
        {
            if(sol(k, strlen(cuv)))
            {
                print(strlen(cuv));
            }
            else
            {
                backtrack(k + 1, cuv);
            }
        }
    }
}

int main(void)
{
    char cuvant[100];
    printf("cuvant = ");
    scanf("%100s", cuvant);
    backtrack(0, cuvant);
    return 0;
}