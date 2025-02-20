#include <stdio.h>

int main() {
    float val = 10.0 / 9.0;
    
    for (int k = 0; k < 25; k++) {
        printf("%f\n", val);
        val = (val - 1.0) * 10;
    }
    
    return 0;
}
