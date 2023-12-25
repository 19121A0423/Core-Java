package org.november14;

import java.util.Scanner;

public class CupGame {
	Scanner scanner = new Scanner(System.in);
	int[][] teams;
	int noOfTeams;
	int time;
	
	public void playGame() {
		
		System.out.println("Game Start");
		System.out.println("enter no of teams playing");
		noOfTeams = scanner.nextInt();
		if(noOfTeams>1) {
			System.out.println("enter timelimit for game");
			time = scanner.nextInt();

			teams = new int[noOfTeams][time / 2];

			for (int index1 = 0; index1 < teams.length; index1++) {
				startGame(index1);
			}
			
			findingWinner();
		}
		else {
			System.out.println("Atleast 2 teams are required to play game");
			System.out.println("Game End");
		}

	}

	public void startGame(int teamno) {
		System.out.println("enter points for team " + (teamno+1));
		System.out.println("1 for success \n2 for failure");
		for (int timecount = 0; timecount < time/2 ; timecount++) {
			int point=scanner.nextInt();
			if(point==0 || point==1) {
				teams[teamno][timecount] = point;
			}
			else {
				System.out.println("Invalid point");
			}
		}
		System.out.println("Thanks for playing the game team " + (teamno+1));
	}
	
	public void findingWinner() {
		int result=0;
		int team=0;
		for(int index=0;index<teams.length;index++) {
			int tempResult=countingResult(teams[index]);
			if(tempResult>result) {
				result=tempResult;
				team=index+1;
			}
		}
		System.out.println("Team "+team+" won the game with "+result+" points");
	}
	
	public int countingResult(int[] team) {
		int result=0;
		for(int index=0;index<team.length;index++) {
			if(team[index]==1) {
				result++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		CupGame cupGame = new CupGame();
		cupGame.playGame();
	}

}
