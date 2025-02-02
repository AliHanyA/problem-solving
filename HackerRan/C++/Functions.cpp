#include <iostream>
#include <cstdio>
#include <algorithm> // Include for std::max
using namespace std;

// Function to find the maximum of four integers
int fun(int a, int b, int c, int d) {
    return max({a, b, c, d});
}

int main() {
    int a, b, c, d;
    cin >> a >> b >> c >> d; // Correct the variable order
    cout << fun(a, b, c, d) << endl; // Fix the function call (use commas)
    return 0;
}
