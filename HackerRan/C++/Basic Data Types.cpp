#include <iostream>
#include <iomanip> // For fixed and setprecision
using namespace std;

int main() {
    int num_int = 0;
    long num_long = 0;
    char leater = 'a'; 
    float num_float = 0.0f;
    double num_double = 0.0;

    // Input
    cin >> num_int >> num_long >> leater >> num_float >> num_double;

    // Output
    cout << num_int << endl
         << num_long << endl
         << leater << endl 
         << fixed << setprecision(2) << num_float <<endl
         << setprecision(5) << num_double << endl;

    return 0;
}
