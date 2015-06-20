module ProjectEuler.Problem1_2 where

sumMultiples :: Integral a => a -> a -> a-> a
sumMultiples a b end = calc a + calc b - calc (lcm a b)
  where
    calc m = m * n * (n + 1) `div` 2
      where
        n = (end - 1) `div` m

main :: IO ()
main = print $ sumMultiples 3 5 1000
