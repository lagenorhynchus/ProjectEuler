"use strict"

sumMultiples = (m, end) ->
  n = Math.floor((end - 1) / m)
  Math.floor(m * n * (n + 1) / 2)

sumMultiplesOf3And5 = (end) ->
  sumMultiples(3, end) + sumMultiples(5, end) - sumMultiples(15, end)

console.log sumMultiplesOf3And5(1000)
