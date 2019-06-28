import React from 'react';
import TextField from '@material-ui/core/TextField'
import Button from "@material-ui/core/Button";
function SignIn() {
    return(
        <div className="homeContent" style={contentStyle}>
            <h1>Sign in to save notes to your account</h1>
            <TextField
                id="standard-name"
                label="Login"
                margin="normal"
            />
            <TextField
                id="standard-password-input"
                label="Password"
                type="password"
                autoComplete="current-password"
                margin="normal"
            />

            <div style={{marginTop:'25px'}}>
                <Button href={'profile'} style={addButtonStyle}>Sign in</Button>
                <Button href={'signup'} style={addButtonStyle}>Sign up</Button>
            </div>
        </div>
    )
}

const addButtonStyle = {
    background: 'linear-gradient(45deg, #FE6B8B 30%, #FF8E53 90%)',
    border: 0,
    borderRadius: 30,
    boxShadow: '0 3px 5px 2px rgba(255, 105, 135, .3)',
    color: 'white',
    height: 48,
    padding: '0 30px',
    margin: '10px'
};

const contentStyle = {
    textAlign: 'center',
    height: '90vh',
    display: 'flex',
    flexDirection: 'column',
    alignItems: 'center',
    justifyContent: 'center'
};


export default SignIn;