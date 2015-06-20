"use strict"

class SumMultiples
  constructor: (@a, @b) ->

  result: (end) ->
    calc = (m) ->
      n = Math.floor((end - 1) / m)
      Math.floor(m * n * (n + 1) / 2)
    calc(@a) + calc(@b) - calc(@a * @b / gcd(@a, @b))

  gcd = (x, y) ->
    while y > 0
      r = x % y
      x = y
      y = r
    x

sm = new SumMultiples(3, 5)
console.log sm.result(1000)
