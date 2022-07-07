package com.example.pritesh;

public class Helper {
    private Question[] questions = new Question[5];


    public Helper() {
        questions[0] = new Question("what is the full form of MSU?",
                new String[]{"Mont", "mummy", "Montclair State University"},
                new int[]{2}
        );
        questions[1] = new Question("what is the measurement of a Right Angle?",
                new String[]{"28", "32", "90"},
                new int[]{2}
        );
        questions[2] = new Question("Which of the following numbers are divide by 2?(multiple answers)",
                new String[]{"2", "4","7"},

                new int[]{0, 1}
        );
        questions[3] = new Question("which of the following grows from a seed?",
                new String[]{"caterpillar","plants","car"},
                new int[]{1}
        );
        questions[4] = new Question("Who is the 46th president of US?",
                new String[]{"Barack Obama","Donald Trump","Joe Biden"},
                new int[]{2}
        );

    }

    public Question[] getQuestions() {
        return questions;
    }
}

