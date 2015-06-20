module Problem1
  module_function

  def sum_multiples(m, en)
    n = (en - 1) / m
    m * n * (n + 1) / 2
  end

  def sum_multiples_of_3_and_5(en)
    sum_multiples(3, en) + sum_multiples(5, en) - sum_multiples(15, en)
  end
end

if __FILE__ == $0
  puts Problem1.sum_multiples_of_3_and_5(1000)
end
