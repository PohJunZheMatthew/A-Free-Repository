local indexOfPrimeNum = tonumber(io.read("*a"))
local primeNums = {}
local currentNum = 2
function isPrime(n)
  if n < 2 then return false end
  for i = 2, math.sqrt(n) do
    if n % i == 0 then
      return false
    end
  end
  return true
end
while #primeNums < indexOfPrimeNum do
  if isPrime(currentNum) then
    table.insert(primeNums, currentNum)
  end
  currentNum = currentNum + 1
end
print(primeNums[#primeNums])
