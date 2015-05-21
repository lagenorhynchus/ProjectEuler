module ProjectEuler.Problem2 where

sumEvenFibonacciNumbers :: Integral a => a -> a
sumEvenFibonacciNumbers m = sum $ takeWhile (<= m) evenFibs
  where
    evenFibs = 2 : 8 : zipWith (\a b -> a + 4 * b) evenFibs (tail evenFibs)

main :: IO ()
main = print $ sumEvenFibonacciNumbers 4000000
