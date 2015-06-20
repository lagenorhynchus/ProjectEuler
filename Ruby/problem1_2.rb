module Problem1_2
  class SumMultiples
    attr_reader :a, :b

    def initialize(a, b)
      @a = a
      @b = b
    end

    def result(en)
      calc = lambda do |m|
        n = (en - 1) / m
        m * n * (n + 1) / 2
      end
      calc.(a) + calc.(b) - calc.(a * b / a.gcd(b))
    end
  end
end

if __FILE__ == $0
  sm = Problem1_2::SumMultiples.new(3, 5)
  puts sm.result(1000)
end
