import sys,math
data = sys.stdin.read()
data = data.split("\n")
indexOfPrimeNums = int(data[0])
primeNums = []
currentNum = 2
def isPrime(n):
    is_prime = True
    if n <= 1:
        is_prime = False
    else:
        is_prime = True
        for i in range(2, int(math.sqrt(n)) + 1):
            if n % i == 0:
                is_prime = False
                break
    return is_prime
while True:
    if len(primeNums) == indexOfPrimeNums:
        print(primeNums[len(primeNums)-1])
        break
    else:
        if isPrime(currentNum):
            primeNums.append(currentNum)
        currentNum+=1;
