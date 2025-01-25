#include <iostream>
#include <cmath> 
using namespace std;
 
int main() {
    double A, B;
    cin >> A >> B;
 
    int floorResult = floor(A / B);
    int ceilResult = ceil(A / B);
    int roundResult = round(A / B);
 
    cout << "floor " << A << " / " << B << " = " << floorResult << endl
    << "ceil " << A << " / " << B << " = " << ceilResult << endl
    << "round " << A << " / " << B << " = " << roundResult << endl;
 
    return 0;
}
