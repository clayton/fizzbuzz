require 'test/unit'

class FizzBuzz
  attr_accessor :results

  def initialize
    self.results = []
  end

  def run
    (1..100).to_a.each do |num|
      self.results << evaluate_number(num)
    end
  end

  def evaluate_number(num)
    return "FizzBuzz" if (num % 3 == 0 && num % 5 == 0)
    return "Fizz" if num == 3
    return "Fizz" if num % 3 == 0
    return "Buzz" if num == 5
    return "Buzz" if num % 5 == 0
  end
end

class FizzBuzzTest < Test::Unit::TestCase

  def setup
    @fizzbuzz = FizzBuzz.new
    @fizzbuzz.run
  end

  def test_counts_to_100
    assert_equal(100, @fizzbuzz.results.size)
  end

  def test_number_three_as_fizz
    assert_equal("Fizz", @fizzbuzz.evaluate_number(3))
  end

  def test_multiples_of_three_as_fizz
    assert_equal("Fizz", @fizzbuzz.evaluate_number(9))
  end

  def test_number_five_as_buzz
    assert_equal("Buzz", @fizzbuzz.evaluate_number(5))
  end

  def test_multiples_of_five_as_buzz
    assert_equal("Buzz", @fizzbuzz.evaluate_number(10))
  end

  def test_multiples_of_five_and_three_as_fizzbuzz
    assert_equal("FizzBuzz", @fizzbuzz.evaluate_number(15))
  end

  def test_enough_fizzbuzzes_present
    assert_equal(6, @fizzbuzz.results.select{|r| r == "FizzBuzz"}.size)
  end

end