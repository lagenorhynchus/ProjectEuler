module ProjectEuler.Problem3 where

largestPrimeFactor :: Integral a => a -> a
largestPrimeFactor = head . primeFactors
  where
    f n divisor acc
      | divisor > n          = acc
      | n `mod` divisor == 0 = f (n `div` divisor) divisor (divisor : acc)
      | otherwise            = f n (divisor + 1) acc
    primeFactors n = f n 2 []

main :: IO ()
main = print $ largestPrimeFactor 600851475143
