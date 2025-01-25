#include <cstdio> 
#include <cmath> 
int main() {
    double R;
    const double PI = 3.141592653; 
    scanf("%lf", &R);
    double area = PI * pow(R, 2);
    printf("%.9f\n", area);
 
    return 0;
}
