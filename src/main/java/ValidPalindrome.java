public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        StringBuilder leftToRight = new StringBuilder();
        s.chars().filter(Character::isLetterOrDigit)
                .map(Character::toLowerCase)
                .forEach(leftToRight::appendCodePoint);
        StringBuilder rightToLeft = new StringBuilder(leftToRight).reverse();
        System.out.println("leftToRight "+leftToRight.toString()+" rightToLeft "+rightToLeft.toString());
        return leftToRight.toString().equals(rightToLeft.toString());
    }
}
