#include <iostream>
#include"stdlib.h"
#include "stdio.h"
#include <string>
#include <sstream>

using namespace std;

int possibilities(string s){
  int total = 1;
  for (int i = 0; i < s.size(); i ++){
    if (s[i] == 'T' || s[i] =='D' || s[i] =='D' || s[i] =='L'|| s[i] =='F'){
        total *= 2;
    }
  }
  printf("%d\n",total );
}

int main(int argc, char const *argv[]) {
  int n =10;
  string strs [n];
  // boucle sur les differentes lignes jusqua 10 / EOF
  for(int i = 0; i< n; i++){
    getline(cin,strs[i]);
  }
  for(int i = 0; i< n; i++){
    possibilities(strs[i]);
  }
}
