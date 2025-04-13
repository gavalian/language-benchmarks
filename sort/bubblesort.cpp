
#include <iostream>
#include <vector>
#include <chrono>
#include <cstdlib>

void create(std::vector<int>& arr, int size){
  arr.resize(size);
  for(int i = 0; i < size; i++){
    arr[i] = std::rand() % 2048 + 1;
  }
}
void bubbleSort(std::vector<int>& arr) {
    int n = arr.size();
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap arr[j] and arr[j+1]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

int main() {
    //std::vector<int> arr = {64, 34, 25, 12, 22, 11, 90};

    int iter = 15;
    std::vector<int> arr = {64, 34, 25, 12, 22, 11, 90};
    for(int i = 0; i < iter; i++){
        create(arr,128);
    auto startTime = std::chrono::high_resolution_clock::now();
    bubbleSort(arr);
    auto endTime = std::chrono::high_resolution_clock::now();

    /*std::cout << "Sorted array: ";
    for (int num : arr) {
        std::cout << num << " ";
    }
    std::cout << std::endl;
    */
    auto duration = std::chrono::duration_cast<std::chrono::nanoseconds>(endTime - startTime);
    std::cout << "Time taken in nanoseconds: " << duration.count() << std::endl;
    }
    return 0;
}
