package com.sparta.jag;

public class FilmClassification {
    public static String getClassificationsByAge(int ageOfViewer)
    {
        String result;
        if (ageOfViewer > 0 && ageOfViewer < 12)
        {
            result = "U, PG films are available.";
        }
        else if (ageOfViewer < 15 && ageOfViewer >= 12)
        {
            result = "U, PG, 12 films are available.";
        }
        else if (ageOfViewer < 18 && ageOfViewer >= 15)
        {
            result = "U, PG, 12, 15 films are available.";
        }
        else if (ageOfViewer < 0)
        {
            result = "Please enter a correct age.";
        }
        else
        {
            result = "All films are available.";
        }
        return result;
    }
}
