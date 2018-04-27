#include <iostream>
#include"stdlib.h"
#include "stdio.h"
#include <string>
#include <sstream>

using namespace std;

int main(int argc, char const *argv[]) {
  int n = atoi(argv[1]);
  ostringstream oss;
  oss << 'W';
  for (int i =0; i < n; i++){
    oss << 'o';
  }
  oss << 'w';

  string var = oss.str();
  cout << var << endl;
 return 0;
}
