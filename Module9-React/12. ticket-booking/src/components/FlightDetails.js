import React from 'react';

function FlightDetails() {

    return (
        <table border="1" cellPadding="10">
            <thead>
            <tr>
                <th>Flight Name</th>
                <th>From</th>
                <th>To</th>
                <th>Fare</th>
            </tr>
            </thead>

            <tbody>

            <tr>
                <td>Air India</td>
                <td>Chennai</td>
                <td>Delhi</td>
                <td>₹4500</td>
            </tr>

            <tr>
                <td>IndiGo</td>
                <td>Hyderabad</td>
                <td>Mumbai</td>
                <td>₹3200</td>
            </tr>

            <tr>
                <td>SpiceJet</td>
                <td>Bangalore</td>
                <td>Kolkata</td>
                <td>₹5100</td>
            </tr>

            </tbody>

        </table>
    );
}

export default FlightDetails;