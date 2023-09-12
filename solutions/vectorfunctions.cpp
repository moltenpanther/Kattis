#include "vectorfunctions.h"

void backwards(std::vector<int>& vec){

    int temp = 0;
    for(int i = 0; i < (vec.size() - 1) - i; i++){
        temp = vec.at(i);
        vec.at(i) = vec.at((vec.size() - 1) - i);
        vec.at((vec.size() - 1) - i) = temp;
    }
    
}

std::vector<int> everyOther(const std::vector<int>& vec){

    std::vector<int> newVec;
    
    for(int i = 0; i < vec.size(); i++){
        if(i % 2 == 0){
            newVec.push_back(vec.at(i));
        }
    }
    
    return newVec;
}

int smallest(const std::vector<int>& vec){
    
    int min = 2001;
    for(int i = 0; i < vec.size(); i++){
        if(vec.at(i) < min){
            min = vec.at(i);
        }
    }

    return min;
}

int sum(const std::vector<int>& vec){
    
    int sum = 0;
    for(int i = 0; i < vec.size(); i++){
        sum += vec.at(i);
    }

    return sum;
}

int veryOdd(const std::vector<int>& suchVector){
    
    int count = 0;
    for(int i = 0; i < suchVector.size(); i++){
        if(i % 2 != 0 && suchVector.at(i) % 2 != 0){
            count++;
        }
    }

    return count;
}
