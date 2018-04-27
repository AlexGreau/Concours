#include <iostream>
#include"stdlib.h"
#include "stdio.h"
#include <string>
#include <sstream>

using namespace std;

int main(int argc, char const *argv[]) {
  int n = atoi(argv[1]);
  int x = atoi(argv[2]);
  int y = atoi(argv[3]);

  int z = x;
  while (z < n){
    if (z % y != 0){
      printf("%d\n",z );
    }
    z += x;
  }

}
