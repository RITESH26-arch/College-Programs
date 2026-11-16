#include <iostream>
using namespace std;

int main() {
    int arr[100], n, choice, pos, value, i;

    cout << "Enter number of elements: ";
    cin >> n;

    cout << "Enter elements: ";
    for (i = 0; i < n; i++) {
        cin >> arr[i];
    }

    cout << "\n1. Insertion";
    cout << "\n2. Deletion";
    cout << "\n3. Searching";
    cout << "\nEnter your choice: ";
    cin >> choice;

    switch (choice) {

        // Insertion
        case 1:
            cout << "Enter position for insertion: ";
            cin >> pos;

            cout << "Enter value: ";
            cin >> value;

            for (i = n; i >= pos; i--) {
                arr[i] = arr[i - 1];
            }

            arr[pos - 1] = value;
            n++;

            cout << "Array after insertion: ";
            for (i = 0; i < n; i++) {
                cout << arr[i] << " ";
            }
            break;

        // Deletion
        case 2:
            cout << "Enter position for deletion: ";
            cin >> pos;

            for (i = pos - 1; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            n--;

            cout << "Array after deletion: ";
            for (i = 0; i < n; i++) {
                cout << arr[i] << " ";
            }
            break;

        // Searching
        case 3:
            cout << "Enter value to search: ";
            cin >> value;

            for (i = 0; i < n; i++) {
                if (arr[i] == value) {
                    cout << "Element found at position " << i + 1;
                    return 0;
                }
            }

            cout << "Element not found.";
            break;

        default:
            cout << "Invalid choice.";
    }

    return 0;
}

