#include <iostream>
#include <vector>
#include <string>

using namespace std;

const string HOUSES[4] = {"Hufflepuff", "Ravenclaw", "Slytherin", "Gryffindor"};

string ask_question(string question) {
        string response;

        cout << question << " : ";
        cin >> response;

        return response;
}

bool compare_without_casing(string a, string b) {
        if (a.length() != b.length()) {
                return false;
        }

        for (int i = 0; i < a.length(); i++) {
                if (tolower(a[i]) != tolower(b[i])) {
                        return false;
                }
        }

        return true;
}

int main() {
        string question = ask_question("Are you Cunning, Brave, Loyal, or Smart?");

        if (compare_without_casing(question, "brave")) {
                cout << HOUSES[3] << endl;
        }
        else if (compare_without_casing(question, "cunning")) {
                cout << HOUSES[2] << endl;
        }
        else if (compare_without_casing(question, "loyal")) {
                cout << HOUSES[0] << endl;
        }
        else if (compare_without_casing(question, "smart")) {
                cout << HOUSES[1] << endl;
        } else {
                cout << "That isn't an answer!" << endl;
                return 1;
        }

        return 0;
}
