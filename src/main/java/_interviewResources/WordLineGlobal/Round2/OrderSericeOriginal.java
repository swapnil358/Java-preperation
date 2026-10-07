package _interviewResources.WordLineGlobal.Round2;

//"Review this code and tell me what problems you see."


/*
  *       Answer - You have to cover all these use cases
  *
          price == null?      → if wrapper
          quantity == 0?      → valid or invalid?
          quantity < 0?       → invalid?
          price < 0?          → invalid?
          price = NaN?        → possible for double
          price = Infinity?   → possible for double
          precision?          → money should not normally use double
          overflow?           → depending on type
  *
  * */
public class OrderSericeOriginal {


        private double total = 0;

        public void addItem(Double price, Integer quantity) {

            if (quantity > 0) {
                total = total + price * quantity;
            }
        }

        public double getTotal() {
            return total;
        }
    }

