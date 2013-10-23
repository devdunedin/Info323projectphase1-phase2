/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sign;

import domain.Customer;
import java.rmi.RemoteException;
import javax.jws.WebService;

/**
 *
 * @author devpu550
 */
@ WebService(endpointInterface = "sign.ISignService",
serviceName = "SignService",
portName = "SignPort")
public class SignServiceImpl implements ISignService {

   String sunsign;


   @Override
   public String signCalculator(Customer customer) throws RemoteException {
      int signPerson = 0;
     
      if ((customer.getMonth().equals("april") && customer.getDob() < 20)
              || (customer.getMonth().equals("march") && customer.getDob() > 20)) {
         signPerson = 1;
      } else if ((customer.getMonth().equals("may") && customer.getDob() < 21)
              || (customer.getMonth().equals("april") && customer.getDob() > 19)) {
         signPerson = 2;
      } else if ((customer.getMonth().equals("june") && customer.getDob() < 21)
              || (customer.getMonth().equals("may") && customer.getDob() > 20)) {
         signPerson = 3;
      } else if ((customer.getMonth().equals("july") && customer.getDob() < 23)
              || (customer.getMonth().equals("june") && customer.getDob() > 20)) {
         signPerson = 4;
      } else if ((customer.getMonth().equals("august") && customer.getDob() < 23)
              || (customer.getMonth().equals("july") && customer.getDob() > 22)) {
         signPerson = 5;
      } else if ((customer.getMonth().equals("september") && customer.getDob() < 23)
              || (customer.getMonth().equals("august") && customer.getDob() > 22)) {
         signPerson = 6;
      } else if ((customer.getMonth().equals("october") && customer.getDob() < 23)
              || (customer.getMonth().equals("september") && customer.getDob() > 22)) {
         signPerson = 7;
      } else if ((customer.getMonth().equals("november") && customer.getDob() < 22)
              || (customer.getMonth().equals("october") && customer.getDob() > 21)) {
         signPerson = 8;
      } else if ((customer.getMonth().equals("december") && customer.getDob() < 20)
              || (customer.getMonth().equals("november") && customer.getDob() > 21)) {
         signPerson = 9;
      } else if ((customer.getMonth().equals("january") && customer.getDob() < 20)
              || (customer.getMonth().equals("decmber") && customer.getDob() > 21)) {
         signPerson = 10;
      } else if ((customer.getMonth().equals("february") && customer.getDob() < 19)
              || (customer.getMonth().equals("january") && customer.getDob() > 19)) {
         signPerson = 11;
      } else if ((customer.getMonth().equals("march") && customer.getDob() < 21)
              || (customer.getMonth().equals("february") && customer.getDob() > 18)) {
         signPerson = 12;

      } else {
        // sunsign = "dont know";
         signPerson = 13;
      }

      if(customer.getDob() > 31 || customer.getDob() < 0 ) {
         signPerson = 13;
      }

      switch (signPerson) {
         case 1:
            switch (customer.getGender()) {
               case "male":

                  sunsign = "Congratulations. You are an ARIES MALE. You sir, are a natural born leader."
                          + "You like to jump into things head on but you forget details a lot of the time."
                          + "You are very optimistic as a person. Nothing keps you low for long. People might "
                          + "have to repeat themselves with you because you live in the moment and hence dont "
                          + "LISTEN when spoken to. You listen its just that you forget. Have fun in life cuz "
                          + " u are the type who was born to PARTYYYYYYYYYYYYYYYYY.";
                  break;
               case "female":
                  sunsign = "Congratulations. You are an ARIES FEMALE. You are the baby in the family. "
                          + " Everybody loves ur energy and convivial nature. Friends love u cuz u dont"
                          + "keep grudges for long. You get annoyed pretty quick but forgive quite easily"
                          + " as well. You have a lovely smile that makes everybody around you smile as "
                          + "well. So keep smiling and be happy cuz even if you face any troubles that"
                          + " may come your way will not be able to stay for long against ur winning smile.";
                  break;
               default:
                  sunsign = "incorrect details. Please check again";
                  break;
            }
            break;
         case 2:
            switch (customer.getGender()) {
               case "male":
                  sunsign = "Congratulations. You are a TAURUS MALE. You dont like to talk all the time."
                          + " You are the quiet kind who loves to finish his job and then relax. You have"
                          + " strong shoulders and upper body strength. Would be good at throwing some "
                          + "punches. You dont like to argue but when pushed to the limit will punch the "
                          + "guy. You love money a lot and you should because you have the personality and"
                          + "patience of a billionaire.";
                  break;
               case "female":
                  sunsign = "Congratulations. You are a TAURUS FEMALE. You are an incredibly strong person."
                          + "You love soft things, music, pillows everything as long as they are soft."
                          + "You love the calm and quiet. You are hardworking as a person but can be quite"
                          + " stubborn at times. If trained you could be an excellent chef because of the "
                          + "amazing patience you posess. You might have been shy as a kid. Remember to have "
                          + "confidence in urself and sing more often cuz you have a jazzy voice.";

                  break;
               default:
                  sunsign = "incorrect details. Please check again";
                  break;
            }
            break;
         case 3:
            switch (customer.getGender()) {
               case "male":
                  sunsign = "Congratulations. You are a GEMINI MALE. Curiosity is ur first nature. You are the kid"
                          + "who exchanged salt to sugar just to have some fun. You like to explore everything and"
                          + " argue about everything. You have a mmind that craves for intellectual stimulation. You"
                          + "might turn out to be an awesome scientist in the future. Good Luck.";
                  break;
               case "female":
                  sunsign = "Congratulations. You are a GEMINI FEMALE. You are an intelligent being. Everybody likes"
                          + "talking to u cuz u are an excellent communicator. The downside is people generally "
                          + "misunderstand ur intentions and u hope u find somebody who does. Its just that u have"
                          + " too many thoughts in ur head and when u express them all at once it confuses some people."
                          + "Keep talking and enjoying life as you will meet all kinds of people that will interest you"
                          + " and not one day will pass that bores you.";
                  break;
               default:
                  sunsign = "incorrect details. Please check again";
                  break;
            }
            break;
         case 4:
            switch (customer.getGender()) {
               case "male":
                  sunsign = "Congratulations. You are a CANCER MALE. You are the guy other girls talk as being MOMMA'S BOY"
                          + "Its not that u do everything what momma says, its just that you love her too much. You are "
                          + "incredibly close to her and pick up on some good habits as well e.g. You love to save. So "
                          + "anybody who marries you will have an incredibly utilitarian husband. Also u can cook some "
                          + "awesome meals if need be, again all comes from momma. and alst but not least you are amazing"
                          + " with kids.";
                  break;
               case "female":
                  sunsign = "Congratulations. You are a CANCER FEMALE. You are the girl whose kids would love to write "
                          + "WORLD's best MOMMA. You are moody from time to time and love romatic candlelight dinners as"
                          + " well as beachside walks. YOu are very caring by nature and will look after everybody close"
                          + " to you. You love to cry a lot when u are low because that relieves the stress and makes "
                          + "you feel good. You are like the beautiful moon that wanes and grows from a crescent to a "
                          + "brilliant full moon.";
                  break;
               default:
                  sunsign = "incorrect details. Please check again";
                  break;
            }
            break;
         case 5:
            switch (customer.getGender()) {
               case "male":
                  sunsign = " Congratulations. You are a LEO MALE. You love alcohol and meat too much. You like rsiking "
                          + "everything from time to time. You are lazy and very posessive about your stuff and women."
                          + " You are a good friend to people and are the best DAD because you would love to "
                          + "spoil your kids. Relax a bit on the alcohol and partying from time to time and  you will be "
                          + "pretty set in life.";
                  break;
               case "female":
                  sunsign = "Congratulations. You are a LEO FEMALE. You know how to put on a makeup and look stunning if "
                          + "need be. You can be subdued at times but when the buzz hits you at the right spot, you can "
                          + "pretty amazing. You might have had a lot of fights in ur family when u were younger because"
                          + " you are rebellious by nature. Your friends may think you are bit of a teenager most of the "
                          + "time but hey you represent the youth of this world and believe in going guns blazing in the end.";
                  break;
               default:
                  sunsign = "incorrect details. Please check again";
                  break;
            }
            break;
         case 6:
            switch (customer.getGender()) {
               case "male":
                  sunsign = "Congratulations. You are a VIRGO MALE. You have an artistic mind which if developed could do "
                          + "quite amazing stuff. You might deviate towards depression if you are not systematic in ur work."
                          + "But if you follow ur own rules ur life will be like a clockwork. Efficent and right on time."
                          + "Hopefully not the clockwork orange. Cheers";
                  break;
               case "female":
                  sunsign = "Congratulations. You are a VIRGO FEMALE. This could be one of the best signs for a girl. You are "
                          + "feminine, hardworking and pragmatic. You like to wake up on time, finish work on time and go to sleep."
                          + "You like physical exercise as well. You love making lists, shopping lists, eating lists, working lists,"
                          + " all kinds of lists. You believe in keeping a healthy body and a healthy mind. Well as they say early to "
                          + "bed and early to rise makes a virgo girl healthy, wealthy and wise. ";
                  break;
               default:
                  sunsign = "incorrect details. Please check again";
                  break;
            }
            break;
         case 7:
            switch (customer.getGender()) {
               case "male":
                  sunsign = "Congratulations. You are a LIBRA MALE. You are one of the most balance guys in the world. You like to manage "
                          + "your job and life as smoothly as possible. You are responsible but can appear to be lazy at times because you "
                          + "take forever to come to a decision. Well its not your fault, there are so many aspects to everything after all"
                          + "and to keep everything balanced is a hard job which is ur forte cuz after all you represent a pair of scales."
                          + "You are a born romantic who would love to spend as much time as possible with girls. Its cuz of BALANCE again."
                          + "you are a guy and to balance it you want to be with girls all the time. HEHEHE";
                  break;
               case "female":
                  sunsign = "Congratulations. You are a LIBRA FEMALE. You might seem a bit dominating at times but hey you are an intelligent "
                          + "leader so that comes with the teritorry. You have a healthy appetite for knowledge and discussions. DISCUSSIONS, "
                          + "that's your favorite word. You dont like to argue, just discuss everything. The more you talk about everything the"
                          + "happier you are. May GOD Bless you and your intelligent mind.";
                  break;
               default:
                  sunsign = "incorrect details. Please check again";
                  break;
            }
            break;
         case 8:
            switch (customer.getGender()) {
               case "male":
                  sunsign = "Congratulations. You are a SSCORPIO MALE. You are the master manipulator of emotions. You can make people dance "
                          + "to your tunes. You believe in the end results rather than the means. You are mentally, physically and emotionally "
                          + "very strong. There will be very few times when you can be fooled. The best thing about you is when confronted with"
                          + "a direct question you always give an honest answer. You may lie to the world all the time but when somebody asks "
                          + "for it you always give them the TRUTH irrespective of whether they can handle it.";
                  break;
               case "female":
                  sunsign = "Congratulations. You are a SCORPIO FEMALE. If there was ever an oscar for perfect seductress the OSCAR goes to "
                          + "you. You seduce everybody. Mommy, daday, friends, teachers they all cannot withstand your seduction. They love"
                          + " you to bits. You have an aura of mystery to yourself that makes people feel attracted to you like magnets. "
                          + "You do not waste your time in HOCUS POCUS like astrology cuz u do not need to. Well have fun seducing and enjoy"
                          + " your day";
                  break;
               default:
                  sunsign = "incorrect details. Please check again";
                  break;
            }
            break;
         case 9:
            switch (customer.getGender()) {
               case "male":
                  sunsign = "Congratulations. You are a SAGITTARIUS MALE. You have a sharp wit. You make comebacks that makes everybody "
                          + "laugh. You are very convivial and outdoorsy by nature. You would like to explore the world rather than have a "
                          + "desk job. Even though you may appear to be all fun and party all the time you are philiosophical by heart."
                          + "With a warm heart and awesome personality you are sure to make  alot of friends in life and rock till the end.";
                  break;
               case "female":
                  sunsign = "Congratulations. You are a SAGITTARIUS FEMALE. You are a blessed soul. Even though you may not be the smartest"
                          + "in a group everybody loves you because they know you do not hold ill will against anyone. You are a natural born"
                          + "performer. You could be an awesome dancer or sportsperson if you train for it. Always believe in yourself"
                          + "and you will have an awesome life.";
                  break;
               default:
                  sunsign = "incorrect details. Please check again";
                  break;
            }
            break;
         case 10:
            switch (customer.getGender()) {
               case "male":
                  sunsign = "Congratulations. You are a CAPRICORN MALE. You could be a status oriented person in life. You have a good "
                          + "eye for measuring people's worth. That makes you an astute businessman as well. You are a very mature"
                          + " person by nature even though you may not appear to be so. You love the good things in life. Poetry, food,"
                          + "all of it. You are the laidback leader who will do things at a relaxed pace but finish everything by the"
                          + "time its due.";
                  break;
               case "female":
                  sunsign = "Congratulations. You are a CAPRICORN FEMALE. There are very few people in this world who actually know. "
                          + "Most people think you are childlike but you are very matured inside. You like to push yourself and your "
                          + "family all the time, so some people might think of you as a bit of a nag. You like to keep pushing "
                          + "yourself step by step all the time and be the best you can.";
                  break;
               default:
                  sunsign = "incorrect details. Please check again";
                  break;
            }
            break;
         case 11:
            switch (customer.getGender()) {
               case "male":
                  sunsign = "Congratulations. You are an AQUARIUS MALE. You are smart and philosophical. You are very good with evocative"
                          + "monologues that move people. You have a very clear undersatnding of most things in this world and you try"
                          + "to keep an open mind that makes you get along with most people. You feel a sense of belonging with every"
                          + "human being on this planet and would like to see everybody be happy in this world.";
                  break;
               case "female":
                  sunsign = "Congratulations. You are an AQUARIUS FEMALE. You are the classiest woman there ever was. You dont like"
                          + "conflicts, have a soothing voice that makes everyone feel relaxed but your friends always know you are"
                          + "smarter than the. They love your sense of fairness and the importance you give to friendship. You are"
                          + "an amazing friend who people can count on.";
                  break;
               default:
                  sunsign = "incorrect details. Please check again";
                  break;
            }
            break;
         case 12:
            switch (customer.getGender()) {
               case "male":
                  sunsign = "Congratulations. You are a PISCES MALE. Unpredictable is your middle name.You are sensitive at times, "
                          + "intelligent on occasion and mystical sometimes. You cannot be put any category because you show multiple "
                          + "personalities from time to time. You have a lot of empathy for everyone and are saddenned by the misery"
                          + "of people. You are artistic at times and can come up with unpredictable but wise statements.";
                  break;
               case "female":
                  sunsign = "Congratulations. You are a PISCES FEMALE. Many guys are crazy for your innocence and charm. You confuse"
                          + "them with their own thoughts by the way you describe things. You can get offended if someone is too rude"
                          + "but you are quick to forgive as well. People generally think of you as a little girl but you are much "
                          + "stronger and tougher than you appear.";
                  break;
               default:
                  sunsign = "incorrect details. Please check again";
                  break;
            }
            break;
         case 13:
            sunsign = "Incorrect details.";
            break;
         default:
            sunsign = "You did not enter correct details for month. Please Check again.";
            break;

      }
      return sunsign;
   }

   public String signCalculator() {
      return "everythings empty";

   }
}
   