import React from 'react'
import { makeStyles } from '@material-ui/core/styles';

import AppBar from '@material-ui/core/AppBar'
import Toolbar from '@material-ui/core/Toolbar'
import Typography from '@material-ui/core/Typography'
import Button from '@material-ui/core/Button';
import IconButton from '@material-ui/core/IconButton'

const useStyles = makeStyles(theme => ({
    root: {
        flexGrow: 1,
    },
    menuButton: {
        marginRight: theme.spacing(0),
    },
    title: {
        flexGrow: 1,
    },
}));


function NavBar() {
    const classes = useStyles();
    return(
        <div className={classes.root}>
            <AppBar position="static"style={navStyle} >
                <Toolbar >
                    <IconButton href={"/profile"} edge="start" className={classes.menuButton} color="inherit" aria-label="Menu">
                        <i className="material-icons md-dark" >
                            person
                        </i>
                    </IconButton>
                    <Typography variant="title" style={titleStyle} className={classes.title}>
                        Notez
                    </Typography>
                    <Button href={'/addnote'} style={addButtonStyle} className={classes.menuButton}>+ new note</Button>
                </Toolbar>
            </AppBar>
        </div>
    )
}

const navStyle = {
    background: '#fff',
};

const titleStyle = {
    color: '#000',
    fontSize: '28px',
    fontWeight: 'bold'
};

const addButtonStyle = {
    background: 'linear-gradient(45deg, #FE6B8B 30%, #FF8E53 90%)',
    border: 0,
    borderRadius: 30,
    color: 'white',
    height: 48,
    padding: '0 30px',
};

export default NavBar;