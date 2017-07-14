package p10.largestproductinseries;

/**
 * Created by vincenthoang on 7/13/17.
 */
public class main {
    public static void main(String[] args) {
        // Not the most elegant way to do this, maybe.
        // Could save in a text file and pass it through FileReader but not going to bother.
        String sequence = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
        String sequenceBackwards = sequence;

        // Placeholder value to keep the current largest sequence product value
        long largestProduct = 0;

        // Execute this loop as long as the length of the sequence is greater than 13:
        while (sequence.length() >= 13) {
            // If the product of the first 13 characters is greater than the value in largestProduct, replace largestProduct with that value (array indexes start at 0)
            long temp = checkProduct(sequence.substring(0, 13));
            if (temp > largestProduct) {
                largestProduct = temp;
            }
            // Trim off the sequence by removing the first character
            sequence = sequence.substring(1, sequence.length());
        }

   //     // Now do it backwards
   //     int sequenceBackwardsLength = sequenceBackwards.length();
   //     while (sequenceBackwardsLength >= 13) {
   //         int temp = checkProduct(sequenceBackwards.substring(0, sequenceBackwardsLength));
   //         if (temp > largestProduct) {
   //             largestProduct = temp;
   //         }
   //         sequenceBackwards = sequenceBackwards.substring(0, sequenceBackwardsLength--);//
   //     }

        // After the loop is done executing, print out the value of the largestProduct
        System.out.println(largestProduct);
    }

    // This checks the sequence passed into the method body, converts each character into Integers and multiplies them together.
    public static long checkProduct(String input) {
        long x = 1;

        for (int i = 0, n = input.length(); i < n; i++) {
            x *= Integer.parseInt(input.substring(i, i + 1));
        }

        return x;
    }
}
