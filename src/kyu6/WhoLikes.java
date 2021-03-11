package kyu6;

public class WhoLikes {

    public static String whoLikesIt(String... names) {

        String likers = "";

        switch (names.length) {
            case 0:
                likers = "no one likes this";
                break;
            case 1:
                likers = names[0] + " likes this";
                break;
            case 2:
                likers = names[0] + " and " + names[1] + " like this";
                break;
            case 3:
                likers = names[0] + ", " + names[1] + " and " + names[2] + " like this";
                break;
            default:
                likers = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";

        }
        return likers;
    }

}
