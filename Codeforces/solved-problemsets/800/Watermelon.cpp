#include <iostream>

using namespace std;

int main() {
    int weight;
    cin >> weight;

    float newWeight = weight / 2.0;
    float result = newWeight - (weight / 2);

    if(weight > 2 && result == 0) {
        if(weight % 2 == 0) {
            cout << "YES";
        }
    }
    else {
        cout << "NO";
    }   
    return 0;
}