import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ✅ Question Bank (More than 50 Questions)
        String[] questions = {
            "1) Which programming language is known as the backbone of Android development?",
            "2) Who is the founder of Microsoft?",
            "3) What does HTML stand for?",
            "4) Which planet is known as the Red Planet?",
            "5) What is the capital of Japan?",
            "6) Who is known as the father of the computer?",
            "7) Which company created the iPhone?",
            "8) What is the chemical symbol for Gold?",
            "9) Who wrote 'Romeo and Juliet'?",
            "10) Which organ pumps blood in the human body?",
            "11) Java was developed by which company?",
            "12) Which is the smallest prime number?",
            "13) Which gas do humans exhale?",
            "14) Who painted the Mona Lisa?",
            "15) The Pythagoras theorem is related to which shape?",
            "16) Which country is known as the Land of the Rising Sun?",
            "17) What is the boiling point of water at sea level?",
            "18) What currency is used in the USA?",
            "19) Which animal is the national symbol of India?",
            "20) What is the largest mammal?",
            "21) Which continent is called the Dark Continent?",
            "22) Which element is needed for breathing?",
            "23) Who invented the telephone?",
            "24) What is the speed of light?",
            "25) The Taj Mahal is located in which city?",
            "26) Which is the largest planet in the solar system?",
            "27) Which vitamin is produced when we are exposed to sunlight?",
            "28) Who discovered gravity?",
            "29) The Great Wall is located in which country?",
            "30) How many players are there in a cricket team?",
            "31) Which is the fastest land animal?",
            "32) Which programming language is used for web styling?",
            "33) Who is the current CEO of Tesla?",
            "34) The human skeleton has how many bones?",
            "35) What is the chemical formula of water?",
            "36) Who was the first man to walk on the moon?",
            "37) Which bird is known as the king of birds?",
            "38) Who invented the World Wide Web?",
            "39) Which is the longest river in the world?",
            "40) What is the capital of Australia?",
            "41) Which is the hardest natural substance?",
            "42) Who is known as the Iron Man of India?",
            "43) Which device is used to measure temperature?",
            "44) What is the freezing point of water?",
            "45) Who discovered electricity?",
            "46) Which is the national game of India?",
            "47) The study of stars is called?",
            "48) Which ocean is the largest?",
            "49) How many states are there in India?",
            "50) Who was the first Prime Minister of India?",
            "51) Which gas is used in fire extinguishers?",
            "52) Who developed the theory of relativity?",
            "53) Which blood group is known as the universal donor?",
            "54) What is the capital of France?",
            "55) Which animal is called the Ship of the Desert?"
        };

        String[][] options = {
            {"a) Java", "b) Python", "c) Swift", "d) C++"},
            {"a) Steve Jobs", "b) Bill Gates", "c) Elon Musk", "d) Mark Zuckerberg"},
            {"a) Hyper Trainer Marking Language", "b) Hyper Text Markup Language", "c) High Text Machine Language", "d) Hyper Tabular Markup Language"},
            {"a) Earth", "b) Mars", "c) Venus", "d) Jupiter"},
            {"a) Seoul", "b) Tokyo", "c) Beijing", "d) Bangkok"},
            {"a) Charles Babbage", "b) Alan Turing", "c) Thomas Edison", "d) Nikola Tesla"},
            {"a) Samsung", "b) Apple", "c) Google", "d) Microsoft"},
            {"a) Ag", "b) Au", "c) Go", "d) Gd"},
            {"a) William Wordsworth", "b) William Shakespeare", "c) John Milton", "d) Charles Dickens"},
            {"a) Brain", "b) Lungs", "c) Heart", "d) Kidney"},
            {"a) Sun Microsystems", "b) Microsoft", "c) Apple", "d) Google"},
            {"a) 0", "b) 1", "c) 2", "d) 3"},
            {"a) Oxygen", "b) Nitrogen", "c) Carbon Dioxide", "d) Helium"},
            {"a) Pablo Picasso", "b) Leonardo da Vinci", "c) Vincent Van Gogh", "d) Michelangelo"},
            {"a) Rectangle", "b) Triangle", "c) Circle", "d) Square"},
            {"a) Japan", "b) China", "c) Korea", "d) Thailand"},
            {"a) 50°C", "b) 100°C", "c) 200°C", "d) 150°C"},
            {"a) Dollar", "b) Pound", "c) Yen", "d) Euro"},
            {"a) Tiger", "b) Lion", "c) Elephant", "d) Peacock"},
            {"a) Whale", "b) Elephant", "c) Shark", "d) Giraffe"},
            {"a) Asia", "b) Africa", "c) Europe", "d) America"},
            {"a) Oxygen", "b) Nitrogen", "c) Carbon Dioxide", "d) Hydrogen"},
            {"a) Alexander Graham Bell", "b) Edison", "c) Tesla", "d) Newton"},
            {"a) 3x10^8 m/s", "b) 3x10^6 m/s", "c) 3x10^5 m/s", "d) 3x10^7 m/s"},
            {"a) Agra", "b) Delhi", "c) Jaipur", "d) Mumbai"},
            {"a) Earth", "b) Jupiter", "c) Mars", "d) Saturn"},
            {"a) Vitamin A", "b) Vitamin D", "c) Vitamin C", "d) Vitamin B"},
            {"a) Galileo", "b) Newton", "c) Einstein", "d) Tesla"},
            {"a) India", "b) Japan", "c) China", "d) Korea"},
            {"a) 9", "b) 10", "c) 11", "d) 12"},
            {"a) Tiger", "b) Cheetah", "c) Lion", "d) Horse"},
            {"a) Java", "b) CSS", "c) Python", "d) SQL"},
            {"a) Tim Cook", "b) Elon Musk", "c) Sundar Pichai", "d) Satya Nadella"},
            {"a) 208", "b) 206", "c) 210", "d) 201"},
            {"a) H2", "b) H2O", "c) O2", "d) HO2"},
            {"a) Yuri Gagarin", "b) Neil Armstrong", "c) Buzz Aldrin", "d) Kalpana Chawla"},
            {"a) Eagle", "b) Crow", "c) Peacock", "d) Parrot"},
            {"a) Tim Berners-Lee", "b) Larry Page", "c) Charles Babbage", "d) Bill Gates"},
            {"a) Nile", "b) Amazon", "c) Ganga", "d) Yangtze"},
            {"a) Canberra", "b) Sydney", "c) Melbourne", "d) Brisbane"},
            {"a) Steel", "b) Diamond", "c) Gold", "d) Iron"},
            {"a) Sardar Patel", "b) Nehru", "c) Gandhi", "d) Bose"},
            {"a) Thermometer", "b) Barometer", "c) Hygrometer", "d) Speedometer"},
            {"a) 0°C", "b) 100°C", "c) 50°C", "d) -10°C"},
            {"a) Edison", "b) Benjamin Franklin", "c) Tesla", "d) Newton"},
            {"a) Hockey", "b) Cricket", "c) Football", "d) Kabaddi"},
            {"a) Astrology", "b) Astronomy", "c) Biology", "d) Zoology"},
            {"a) Atlantic", "b) Pacific", "c) Indian", "d) Arctic"},
            {"a) 28", "b) 30", "c) 31", "d) 29"},
            {"a) Jawaharlal Nehru", "b) Rajendra Prasad", "c) Gandhi", "d) Ambedkar"},
            {"a) CO2", "b) O2", "c) N2", "d) H2"},
            {"a) Newton", "b) Einstein", "c) Tesla", "d) Maxwell"},
            {"a) O+", "b) AB+", "c) O-", "d) B+"},
            {"a) Paris", "b) London", "c) Rome", "d) Madrid"},
            {"a) Elephant", "b) Camel", "c) Horse", "d) Donkey"}
        };

        char[] answers = {
            'a','b','b','b','b','a','b','b','b','c',
            'a','c','c','b','b','a','b','a','a','a',
            'b','a','a','a','a','b','b','b','c','b',
            'b','b','b','b','b','b','a','a','a','a',
            'b','a','a','a','b','a','b','b','b','a',
            'a','b','c','a','b'
        };

        int score = 0;
        System.out.println("===== QUIZ GAME (50+ Questions) =====\n");

        // ✅ Quiz Loop
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer: ");
            char userAnswer = sc.next().toLowerCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer is: " + answers[i] + "\n");
            }
        }

        // ✅ Final Result
        System.out.println("===== RESULT =====");
        System.out.println("Your Score: " + score + "/" + questions.length);

        if (score == questions.length) {
            System.out.println("🎉 Excellent! Perfect Score!");
        } else if (score >= questions.length * 0.6) {
            System.out.println("👍 Good job! Keep practicing.");
        } else {
            System.out.println("📖 Better luck next time, study harder!");
        }

        sc.close();
    }
}
