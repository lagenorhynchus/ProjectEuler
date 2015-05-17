module ProjectEuler.Problem1 where

sumMultiples :: Integral a => a -> a-> a
sumMultiples m end = m * n * (n + 1) `div` 2
  where
    n = (end - 1) `div` m

sumMultiplesOf3And5 :: Integral a => a -> a
sumMultiplesOf3And5 end =
  sumMultiples 3 end +
  sumMultiples 5 end -
  sumMultiples (lcm 3 5) end

main :: IO ()
main = print $ sumMultiplesOf3And5 1000
