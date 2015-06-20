(ns project-euler.problem1_2
  (:require [clojure.math.numeric-tower :refer [lcm]]))

(defn sum-multiples [a b end]
  (letfn [(calc [m]
            (let [n (quot (dec end) m)]
              (quot (* m n (+ n 1)) 2)))]
    (- (+ (calc a) (calc b)) (calc (lcm a b)))))

(println (sum-multiples 3 5 1000))
