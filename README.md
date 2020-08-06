# Managing-patient-records-using-Blockchain
Cryptography project in Java
-->We have two kinds of Users - Doctors and Patients
-->A transaction involves a doctor and a patient
-->For simplicity we have implemented zero knowledge proof for only patients
-->All the keywords, usernames used are case sensitive
-->Initially blockchain is empty
-->Atleast one patient has to be registered before adding or viewing a transaction
-->Operations should be performed in the following order (initially):
		register-->add-->view

To compile use: javac users.java StringUtil.java Record.java Block.java Main.java
To run use    : java Main

options displayed: view/add/register
	// atleast 1 patient's details need to be registered for further process

        enter-register
	/* Enter patient's name
   	Enter patient's password 
	-->Password should be an INTEGER only and preferably a small integer as it is used in calculations of ZKP
   	Verify patient's password
   	sample i/p-
   	sahil
   	2
   	2
	*/

	// details added successfully

enter-yes //to continue

options displayed: view/add/register

	enter-add
	// to add medical details/reports

	"Enter doc name"

/*
for simplicity we have predefined 3 doctors in the database-

doc1:
name:grover
password:1

doc2:
name:ram
password:2

doc3:
name:raj
password:3
*/

	enter details of doctor
	/*
	example-
	raj
	3 */

	enter the deatils of the patient he checked
	/*
	sahil
	*/
	
	Zero Knowledge Proof to verify user:
	-->Here x is the password of the user
	-->Pick up a random number between 0 and 9
	-->Calculate h (h=(2^r)(mod 11)) and enter h
	-->A random-bit b(0/1) is generated
	-->Compute s=(r+b*x)mod(10) and enter s

	/*
	Kindly verify yourself as a user
	Zero Knowledge Proof
	Choose a random number between 0 and 9(r):
	Please compute h=(2^r)(mod 11) and Enter h
	2
	h is 2
	Random bit(b) is: 0
	Please compute s=(r+b*x)mod(10).Here x is the number you are proving you know(ie the password):
	1
	Zero Knowledge Proof Successful.You are verified as registered user
	*/

	enter-y // to input the reports, medical records,prescription etc.
	/*
	example-
	'y'
	BP 150/95
	'y'
	Blood Sugar Level(fasting) 121
	'y'
	Next checkup scheduled on 07/05/2020
	*/

	enter-n //once the entire data is entered

// Block Mined Successfully and block hash is displyed

	/*
	Trying To mineBlock...
	Block Mined!!! : 0000e326186933fa83f0efd581d09409022ec07b73a10f549bbaa6472e8a1175
	*/


enter-yes // to continue

options displayed: view/add/register

	enter-view //to view several records 

	enter-d or p

	/*
	'd' if you wish to know the details/records of several patients checked by a doctor
	'p' if you wish to fetch the details/records of patient's check-up history
	*/
	if d is selected
		enter required details of doctor
	if p is selected
		//ZKP verification is done similar to the one explained in 'add' option
	
	record blocks are displayed along with TimeStap at which the data was recorded


SAMPLE RUN-

/*
(view/add/register)register

sahil
2
2

(continue?)yes

(view/add/register)add

raj
3 

sahil

Kindly verify yourself as a user
Zero Knowledge Proof
Choose a random number between 0 and 9
Please compute h=(2^r)(mod 11) and Enter h
2
h is 2
Random bit is 0
Please compute s=(r+b*x)mod(10).Here x is the number you are proving you know
1
Zero Knowledge Proof Successful.You are verified as registered user

y
BP 150/95

y
Blood Sugar Level(fasting) 121

y
Next checkup scheduled on 07/05/2020

n

output-
Trying To mineBlock...
Block Mined!!! : 0000e326186933fa83f0efd581d09409022ec07b73a10f549bbaa6472e8a1175

(continue?)yes

(view/add/register)view

'd'
raj
3

output-
TimeStamp at which data  was recorded:1587718441125
Doctor:raj
Patient:sahil
His Medical Data:
BP 150/95
Blood Sugar Level(fasting) 121
Next checkup scheduled on 07/05/2020

(continue?)yes

similarly for patient-

'p'
sahil

Kindly verify yourself as a user
Zero Knowledge Proof
Choose a random number between 0 and 9
Please compute h=(2^r)(mod 11) and Enter h
4
h is 4
Random bit is 1
Please compute s=(r+b*x)mod(10).Here x is the number you are proving you know
4
Zero Knowledge Proof Successful.You are verified as registered user

output-
Time:1587718441125
Doctor:raj
Patient:sahil
Patient's Medical Data:
BP 150/95
Blood Sugar Level(fasting) 121
Next checkup scheduled on 07/05/2020

other blocks are added similarly!!

*/
