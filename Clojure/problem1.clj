(ns project-euler.problem1)

(defn sum-multiples [m end]
  (let [n (quot (dec end) m)]
    (quot (* m n (+ n 1)) 2)))

(defn sum-multiples-of-3-and-5 [end]
  (- (+ (sum-multiples 3 end)
        (sum-multiples 5 end))
     (sum-multiples 15 end)))

(println (sum-multiples-of-3-and-5 1000))
