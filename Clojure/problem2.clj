(ns project-euler.problem2)

(defn sum-even-fibonacci-numbers [m]
  (let [even-fibs (map first (iterate (fn [[a b]] [b (+ a (* 4 b))]) [2 8]))]
    (apply + (take-while #(<= % m) even-fibs))))

(println (sum-even-fibonacci-numbers 4000000))
