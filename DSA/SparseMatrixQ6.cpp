#include <iostream>
using namespace std;

int main()
{
    int a[10][10];
    int rows, cols;
    int count = 0;

    cout << "Enter rows and columns: ";
    cin >> rows >> cols;

    cout << "Enter matrix elements:\n";

    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            cin >> a[i][j];

            if (a[i][j] != 0)
            {
                count++;
            }
        }
    }

    // Display original matrix
    cout << "\nOriginal Matrix:\n";

    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            cout << a[i][j] << " ";
        }
        cout << endl;
    }

    // Check whether matrix is sparse
    if (count < (rows * cols) / 2)
    {
        cout << "\nIt is a Sparse Matrix.\n";

        cout << "\nSparse Matrix (Row Column Value):\n";

        cout << "Row\tColumn\tValue\n";

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (a[i][j] != 0)
                {
                    cout << i << "\t" << j << "\t" << a[i][j] << endl;
                }
            }
        }
    }
    else
    {
        cout << "\nIt is not a Sparse Matrix.\n";
    }

    return 0;
}
