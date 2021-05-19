package kerkom01;
public class jazzyfield {
   std::string itos(int i, std::string const &digits) {
       std::string ret = std::string(digits.length(), digits[0]);
       int base = digits.length();
       int pos = 0;

       while (i) {

           int digit = i % base;
           ret[pos++] = digits[digit];
           i /= base;
       }

       return std::string(ret.rbegin(), ret.rend());
   }

   void gen_all(std::string const& s, std::ostream& os) {
       auto len = s.length();
       std::size_t limit = std::pow(len, len);
       for (size_t i = 0; i < limit; i++)
           os << itos(i, s) << '\t';
   }

   int main() {
       gen_all("ABCDE", std::cout);
   }
}
