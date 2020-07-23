import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Timer;

public class gui {
    private JPanel panel;
    private JButton button1;
    private JButton button4;
    private JButton button2;
    private JButton button3;
    private JButton button6;
    private JButton button9;
    private JButton button8;
    private JButton button5;
    private JButton button7;
    private JPanel gamefield;
    private JPanel buttonfield;
    private JButton startButton;
    private JRadioButton radio1Player;
    private JRadioButton radio2Player;
    private JButton resetButton;
    private JButton stopButton;
    private JLabel labelPlayerAmount;
    private JLabel winfield;

    public int fontSize = Toolkit.getDefaultToolkit().getScreenSize().height / 68;

    private int player = 1;
    private int winner = 0;
    private boolean againstComputer;
    private int takenFields = 0;
    private int[][] field = new int[3][3];


    public gui() {
        //setup beim starten des programms
        loadSizeButtons();

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (button1.getText().equals("") && field[0][0] == 0) {
                    if (player == 1) {
                        field[0][0] = 1;
                        buttonPressedAndCalcWinner(button1);
                    } else if (!againstComputer) {
                        field[0][0] = 2;
                        buttonPressedAndCalcWinner(button1);
                    }
                    if (winner == 0 && againstComputer) {
                        computerSetField();
                    }
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (button2.getText().equals("") && field[0][1] == 0) {
                    if (player == 1) {
                        field[0][1] = 1;
                        buttonPressedAndCalcWinner(button2);
                    } else if (!againstComputer) {
                        field[0][1] = 2;
                        buttonPressedAndCalcWinner(button2);
                    }
                    if (winner == 0 && againstComputer) {
                        computerSetField();
                    }
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (button3.getText().equals("") && field[0][2] == 0) {
                    if (player == 1) {
                        field[0][2] = 1;
                        buttonPressedAndCalcWinner(button3);
                    } else if (!againstComputer) {
                        field[0][2] = 2;
                        buttonPressedAndCalcWinner(button3);
                    }
                    if (winner == 0 && againstComputer) {
                        computerSetField();
                    }
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (button4.getText().equals("") && field[1][0] == 0) {
                    if (player == 1) {
                        field[1][0] = 1;
                        buttonPressedAndCalcWinner(button4);
                    } else if (!againstComputer) {
                        field[1][0] = 2;
                        buttonPressedAndCalcWinner(button4);
                    }
                    if (winner == 0 && againstComputer) {
                        computerSetField();
                    }
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (button5.getText().equals("") && field[1][1] == 0) {
                    if (player == 1) {
                        field[1][1] = 1;
                        buttonPressedAndCalcWinner(button5);
                    } else if (!againstComputer) {
                        field[1][1] = 2;
                        buttonPressedAndCalcWinner(button5);
                    }
                    if (winner == 0 && againstComputer) {
                        computerSetField();
                    }
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (button6.getText().equals("") && field[1][2] == 0) {
                    if (player == 1) {
                        field[1][2] = 1;
                        buttonPressedAndCalcWinner(button6);
                    } else if (!againstComputer) {
                        field[1][2] = 2;
                        buttonPressedAndCalcWinner(button6);
                    }
                    if (winner == 0 && againstComputer) {
                        computerSetField();
                    }
                }
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (button7.getText().equals("") && field[2][0] == 0) {
                    if (player == 1) {
                        field[2][0] = 1;
                        buttonPressedAndCalcWinner(button7);
                    } else if (!againstComputer) {
                        field[2][0] = 2;
                        buttonPressedAndCalcWinner(button7);
                    }
                    if (winner == 0 && againstComputer) {
                        computerSetField();
                    }
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (button8.getText().equals("") && field[2][1] == 0) {
                    if (player == 1) {
                        field[2][1] = 1;
                        buttonPressedAndCalcWinner(button8);
                    } else if (!againstComputer) {
                        field[2][1] = 2;
                        buttonPressedAndCalcWinner(button8);
                    }
                    if (winner == 0 && againstComputer) {
                        computerSetField();
                    }
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (button9.getText().equals("") && field[2][2] == 0) {
                    if (player == 1) {
                        field[2][2] = 1;
                        buttonPressedAndCalcWinner(button9);
                    } else if (!againstComputer) {
                        field[2][2] = 2;
                        buttonPressedAndCalcWinner(button9);
                    }
                    if (winner == 0 && againstComputer) {
                        computerSetField();
                    }
                }
            }
        });
        radio1Player.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                radio2Player.setSelected(false);
            }
        });
        radio2Player.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                radio1Player.setSelected(false);
            }
        });
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                startGame();
            }
        });
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stopGame();
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                resetGame();
            }
        });
    }


    public static void main(String[] args) {
        final int HEIGHT = 900;
        final int WIDTH = 1500;

        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setContentPane(new gui().panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
        frame.setBounds(20,20,WIDTH,HEIGHT);
        frame.setIconImage(new ImageIcon("/tic_tac_toe.png").getImage());
    }


    private void resetGame() {
        this.field = new int[3][3];
        this.player = 1;
        this.winner = 0;
        this.takenFields = 0;
        clearWinner();
        clearGameButtons();
        enableGameButtons();
    }


    private void stopGame() {
        startButton.setEnabled(true);
        stopButton.setEnabled(false);
        resetButton.setEnabled(false);
        labelPlayerAmount.setEnabled(true);

        radio1Player.setEnabled(true);
        radio2Player.setEnabled(true);

        disableGameButtons();
    }


    private void startGame() {
        stopButton.setEnabled(true);
        startButton.setEnabled(false);
        resetButton.setEnabled(true);
        labelPlayerAmount.setEnabled(false);

        radio1Player.setEnabled(false);
        radio2Player.setEnabled(false);

        if (radio1Player.isSelected()) {
            this.againstComputer = true;
        } else if (radio2Player.isSelected()) {
            this.againstComputer = false;
        } else {
            this.againstComputer = false;
            radio2Player.setSelected(true);
        }

        resetGame();
    }


    private void computerSetField() {
        java.util.Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                if (winner == 0 && player == 2 && takenFields < 9) {

                    int[] BEST_FIELD = computerTestBestField(1);
                    int[] WIN_FIELD = computerTestBestField(2);
                    int i0, i1;

                    if (BEST_FIELD == null && WIN_FIELD == null) {
                        i0 = getRandomNumberInRange(0, 2);
                        i1 = getRandomNumberInRange(0, 2);

                        while (field[i0][i1] != 0) {
                            i0 = getRandomNumberInRange(0, 2);
                            i1 = getRandomNumberInRange(0, 2);
                        }
                    } else {
                        if (WIN_FIELD != null) {
                            i0 = WIN_FIELD[0];
                            i1 = WIN_FIELD[1];
                        } else {
                            i0 = BEST_FIELD[0];
                            i1 = BEST_FIELD[1];
                        }
                    }
                    field[i0][i1] = 2;
                    buttonPressedAndCalcWinner(getButtonFromFieldIndex(i0, i1));
                }
            }
        }, 500);
    }


    /**
     * @author Phi Bey
     * @description is returns the best field for the computer to win, or to block the players win
     * @param PLAYER = the best field for the player(1) or the computer(2) to win
     * @return = the best field to choose or returns null when there is no "best field"
     */
    private int[] computerTestBestField(int PLAYER) {
        int count;
        int notFound;

        int countV1 = 0;
        int[] countV1NotFound = {-1, -1};
        int countV2 = 0;
        int[] countV2NotFound = {-1, -1};

        for (int i = 0, x = 2; i < 3; i++, x--) {

            // von links nach rechts
            count = 0;
            notFound = -1;
            for (int j = 0; j < 3; j++) {
                if (this.field[i][j] == PLAYER) {
                    count++;
                } else {
                    notFound = j;
                }
            }
            if (count == 2 && notFound != -1) {
                if (this.field[i][notFound] == 0) {
                    return new int[]{i, notFound};
                }
            }

            // von oben nach unten
            count = 0;
            notFound = -1;
            for (int j = 0; j < 3; j++) {
                if (this.field[j][i] == PLAYER) {
                    count++;
                } else {
                    notFound = j;
                }
            }
            if (count == 2 && notFound != -1) {
                if (this.field[notFound][i] == 0) {
                    return new int[]{notFound, i};
                }
            }

            //von links-oben nach rechts-unten
            if (this.field[i][i] == PLAYER) {
                countV1++;
            } else if (this.field[i][i] == 0) {
                countV1NotFound = new int[] {i,i};
            }

            // von rechts-oben nach links unten
            if (this.field[i][x] == PLAYER) {
                countV2++;
            } else if (this.field[i][x] == 0) {
                countV2NotFound = new int[] {i,x};
            }
        }

        if (countV1 == 2 && countV1NotFound[0] != -1 && countV1NotFound[1] != -1) {
            return countV1NotFound;
        }
        if (countV2 == 2 && countV2NotFound[0] != -1 && countV2NotFound[1] != -1) {
            return countV2NotFound;
        }
        return null;
    }


    private void loadSizeButtons() {
        if (this.fontSize < 15) {
            this.fontSize = 15;
        }
        int PX = this.fontSize * 4;

        panel.setBackground(Color.WHITE);
        gamefield.setBackground(Color.WHITE);

        button1.setFont(new Font("Helvetica Neue", Font.PLAIN, PX));
        button2.setFont(new Font("Helvetica Neue", Font.PLAIN, PX));
        button3.setFont(new Font("Helvetica Neue", Font.PLAIN, PX));
        button4.setFont(new Font("Helvetica Neue", Font.PLAIN, PX));
        button5.setFont(new Font("Helvetica Neue", Font.PLAIN, PX));
        button6.setFont(new Font("Helvetica Neue", Font.PLAIN, PX));
        button7.setFont(new Font("Helvetica Neue", Font.PLAIN, PX));
        button8.setFont(new Font("Helvetica Neue", Font.PLAIN, PX));
        button9.setFont(new Font("Helvetica Neue", Font.PLAIN, PX));

        radio1Player.setFont(new Font("Helvetica Neue", Font.PLAIN, this.fontSize));
        radio2Player.setFont(new Font("Helvetica Neue", Font.PLAIN, this.fontSize));
        resetButton.setFont(new Font("Helvetica Neue", Font.PLAIN, this.fontSize));
        startButton.setFont(new Font("Helvetica Neue", Font.PLAIN, this.fontSize));
        stopButton.setFont(new Font("Helvetica Neue", Font.PLAIN, this.fontSize));
        labelPlayerAmount.setFont(new Font("Helvetica Neue", Font.PLAIN, this.fontSize));
        winfield.setFont(new Font("Helvetica Neue", Font.PLAIN, this.fontSize));
        winfield.setForeground(Color.GREEN);
    }


    private JButton getButtonFromFieldIndex(int i0, int i1) {
        if (i0 == 0 && i1 == 0) {
            return this.button1;
        } else if (i0 == 0 && i1 == 1) {
            return this.button2;
        } else if (i0 == 0 && i1 == 2) {
            return this.button3;
        } else if (i0 == 1 && i1 == 0) {
            return this.button4;
        } else if (i0 == 1 && i1 == 1) {
            return this.button5;
        } else if (i0 == 1 && i1 == 2) {
            return this.button6;
        } else if (i0 == 2 && i1 == 0) {
            return this.button7;
        } else if (i0 == 2 && i1 == 1) {
            return this.button8;
        } else if (i0 == 2 && i1 == 2) {
            return this.button9;
        }
        return null;
    }


    private void enableGameButtons() {
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
    }


    private void disableGameButtons() {
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
    }


    private void clearGameButtons() {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
    }


    /**
     * @author Phi Bey
     * @description displays the "X" or "O" in the pressed field. Also checks if the current player has won.
     * @param button = the button to display the "X" or "O"
     */
    private void buttonPressedAndCalcWinner(JButton button) {
        final int PLAYER = this.player;
        final int[][] FIELD_ARRAY = this.field;
        this.takenFields++;

        if (PLAYER == 1) {
            button.setText("X");
            this.player = 2;
        } else {
            button.setText("O");
            this.player = 1;
        }

        if (FIELD_ARRAY[0][0] == PLAYER) {
            if (FIELD_ARRAY[1][0] == PLAYER && FIELD_ARRAY[2][0] == PLAYER ||
                    FIELD_ARRAY[0][1] == PLAYER && FIELD_ARRAY[0][2] == PLAYER) {
                this.winner = PLAYER;
            }
        }
        if (FIELD_ARRAY[1][1] == PLAYER) {
            if (FIELD_ARRAY[1][0] == PLAYER && FIELD_ARRAY[1][2] == PLAYER ||
                    FIELD_ARRAY[0][1] == PLAYER && FIELD_ARRAY[2][1] == PLAYER) {
                this.winner = PLAYER;
            }
        }
        if (FIELD_ARRAY[2][2] == PLAYER) {
            if (FIELD_ARRAY[2][0] == PLAYER && FIELD_ARRAY[2][1] == PLAYER ||
                    FIELD_ARRAY[0][2] == PLAYER && FIELD_ARRAY[1][2] == PLAYER) {
                this.winner = PLAYER;
            }
        }
        if (FIELD_ARRAY[1][1] == PLAYER && FIELD_ARRAY[0][0] == PLAYER && FIELD_ARRAY[2][2] == PLAYER ||
                FIELD_ARRAY[1][1] == PLAYER && FIELD_ARRAY[2][0] == PLAYER && FIELD_ARRAY[0][2] == PLAYER) {
            this.winner = PLAYER;
        }

        if (this.winner != 0 || this.takenFields >= 9) {
            stopGame();
            showWinner(this.winner);
        }
    }


    private void showWinner(int player) {
        if (this.winner == 0) {
            winfield.setText("Unentschieden!");
        } else if (this.againstComputer) {
            if (player == 1) {
                showWinnerImage();
            } else if (player == 2) {
                winfield.setText("Der Computer hat gewonnen!");
            }
        } else {
            if (player == 1) {
                winfield.setText("\"X\" hat gewonnen!");
            } else if (player == 2) {
                winfield.setText("\"O\" hat gewonnen!");
            }
        }
    }
    private void showWinnerImage() {
        winfield.setIcon(new ImageIcon(getClass().getResource("/win_title2.png")));
    }


    private void clearWinner() {
        winfield.setText("");
        winfield.setIcon(null);
    }


    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}