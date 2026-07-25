import React from "react";

function ListofPlayers() {

    const players = [
        { name: "Virat", score: 95 },
        { name: "Rohit", score: 82 },
        { name: "Gill", score: 66 },
        { name: "Rahul", score: 45 },
        { name: "Hardik", score: 76 },
        { name: "Jadeja", score: 88 },
        { name: "Ashwin", score: 69 },
        { name: "Shami", score: 72 },
        { name: "Bumrah", score: 55 },
        { name: "Siraj", score: 61 },
        { name: "Kuldeep", score: 79 }
    ];

    return (
        <div>

            <h2>List of Players</h2>

            <table border="1" cellPadding="10">
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Score</th>
                </tr>
                </thead>

                <tbody>
                {players.map((player, index) => (
                    <tr key={index}>
                        <td>{player.name}</td>
                        <td>{player.score}</td>
                    </tr>
                ))}
                </tbody>
            </table>

            <br />

            <h2>Players with score below 70</h2>

            <ul>
                {players
                    .filter(player => player.score < 70)
                    .map((player, index) => (
                        <li key={index}>
                            {player.name} - {player.score}
                        </li>
                    ))}
            </ul>

        </div>
    );
}

export default ListofPlayers;