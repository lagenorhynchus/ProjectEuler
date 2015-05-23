(ns project-euler.problem3)

(defn largest-prime-factor [n]
  (letfn [(f [n divisor acc]
            (cond
              (> divisor n)
                acc
              (zero? (rem n divisor))
                (recur (quot n divisor) divisor (cons divisor acc))
              :else
                (recur n (inc divisor) acc)))
          (prime-factors [n]
            (f n 2 []))]
    (first (prime-factors n))))

(println (largest-prime-factor 600851475143))
