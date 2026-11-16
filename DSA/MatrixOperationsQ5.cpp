#include <iostream>
using namespace std;

int main()
{
    int a[10][10], b[10][10];
    int add[10][10], mul[10][10], trans[10][10];

    int r1, c1, r2, c2;

    // First Matrix
    cout << "Enter rows and columns of first matrix: ";
    cin >> r1 >> c1;

    cout << "Enter first matrix:\n";
    for (int i = 0; i < r1; i++)
    {
        for (int j = 0; j < c1; j++)
        {
            cin >> a[i][j];
        }
    }

    // Second Matrix
    cout << "Enter rows and columns of second matrix: ";
    cin >> r2 >> c2;

    cout << "Enter second matrix:\n";
    for (int i = 0; i < r2; i++)
    {
        for (int j = 0; j < c2; j++)
        {
            cin >> b[i][j];
        }
    }

    // Matrix Addition
    if (r1 == r2 && c1 == c2)
    {
        cout << "\nAddition:\n";

        for (int i = 0; i < r1; i++)
        {
            for (int j = 0; j < c1; j++)
            {
                add[i][j] = a[i][j] + b[i][j];
                cout << add[i][j] << " ";
            }
            cout << endl;
        }
    }
    else
    {
        cout << "\nAddition not possible\n";
    }

    // Matrix Multiplication
    if (c1 == r2)
    {
        cout << "\nMultiplication:\n";

        for (int i = 0; i < r1; i++)
        {
            for (int j = 0; j < c2; j++)
            {
                mul[i][j] = 0;

                for (int k = 0; k < c1; k++)
                {
                    mul[i][j] += a[i][k] * b[k][j];
                }

                cout << mul[i][j] << " ";
            }
            cout << endl;
        }
    }
    else
    {
        cout << "\nMultiplication not possible\n";
    }

    // Transpose of First Matrix
    cout << "\nTranspose of First Matrix:\n";

    for (int i = 0; i < c1; i++)
    {
        for (int j = 0; j < r1; j++)
        {
            trans[i][j] = a[j][i];
            cout << trans[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}
